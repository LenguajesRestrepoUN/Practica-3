
public class TypeVisitor extends PsicoderBaseVisitor<Symbol.Type>{

    private Scope current;

    // exp : TK_CARACTER      #expCaracter
    @Override
    public Symbol.Type visitExpCaracter(PsicoderParser.ExpCaracterContext ctx) {
        return Symbol.Type.tCARACTER;
    }

    // exp: TK_ENTERO
    @Override
    public Symbol.Type visitExpEntero(PsicoderParser.ExpEnteroContext ctx) {
        return Symbol.Type.tENTERO;
    }

    @Override
    public Symbol.Type visitExpMenosEntero(PsicoderParser.ExpMenosEnteroContext ctx) {
        return Symbol.Type.tENTERO;
    }

    // exp: TK_REAL
    @Override
    public Symbol.Type visitExpReal(PsicoderParser.ExpRealContext ctx) {
        return Symbol.Type.tREAL;
    }

    @Override
    public Symbol.Type visitExpMenosReal(PsicoderParser.ExpMenosRealContext ctx) {
        return Symbol.Type.tREAL;
    }

    // exp: TK_CADENA
    @Override
    public Symbol.Type visitExpCadena(PsicoderParser.ExpCadenaContext ctx) {
        return Symbol.Type.tCADENA;
    }

    // exp: verdadero
    @Override
    public Symbol.Type visitExpVerdadero(PsicoderParser.ExpVerdaderoContext ctx) {
        return Symbol.Type.tBOOLEANO;
    }

    @Override
    public Symbol.Type visitExpNegVerdadero(PsicoderParser.ExpNegVerdaderoContext ctx) {
        return Symbol.Type.tBOOLEANO;
    }

    // exp: falso
    @Override
    public Symbol.Type visitExpFalso(PsicoderParser.ExpFalsoContext ctx) {
        return Symbol.Type.tBOOLEANO;
    }

    @Override
    public Symbol.Type visitExpNegFalso(PsicoderParser.ExpNegFalsoContext ctx) {
        return Symbol.Type.tBOOLEANO;
    }

    // exp : ID
    @Override
    public Symbol.Type visitExpID(PsicoderParser.ExpIDContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if ( var==null )
            return Symbol.Type.tINVALID;
        return var.type;
    }

    @Override
    public Symbol.Type visitExpMenosID(PsicoderParser.ExpMenosIDContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if ( var==null )
            return Symbol.Type.tINVALID;
        if (var.type == Symbol.Type.tENTERO || var.type == Symbol.Type.tREAL)
            return var.type;
        return Symbol.Type.tINVALID;
    }

    @Override
    public Symbol.Type visitExpNegID(PsicoderParser.ExpNegIDContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if ( var==null )
            return Symbol.Type.tINVALID;
        if (var.type == Symbol.Type.tBOOLEANO)
            return var.type;
        return Symbol.Type.tINVALID;
    }

    //ID  TK_PAR_IZQ  optargs  TK_PAR_DER
    @Override
    public Symbol.Type visitExpFuncion(PsicoderParser.ExpFuncionContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if ( var==null )
            return Symbol.Type.tINVALID;
        return var.type;
    }

    @Override
    public Symbol.Type visitExpNegExp(PsicoderParser.ExpNegExpContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Symbol.Type visitExpParExp(PsicoderParser.ExpParExpContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Symbol.Type visitExpMenosParExp(PsicoderParser.ExpMenosParExpContext ctx) {
        Symbol.Type type = visit(ctx.exp());
        if (type == Symbol.Type.tENTERO || type == Symbol.Type.tREAL)
            return type;
        return Symbol.Type.tINVALID;
    }

    @Override
    public Symbol.Type visitExpNegParExp(PsicoderParser.ExpNegParExpContext ctx) {
        Symbol.Type type = visit(ctx.exp());
        if (type == Symbol.Type.tBOOLEANO)
            return type;
        return Symbol.Type.tINVALID;
    }

    //stmt: LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC
    @Override
    public Symbol.Type visitStmtLeerChain(PsicoderParser.StmtLeerChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + name + "no definida");
            return Symbol.Type.tINVALID;
        }
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }

    //para_stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    @Override
    public Symbol.Type visitParaStmtIDChain(PsicoderParser.ParaStmtIDChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + name + "no definida");
            return Symbol.Type.tINVALID;
        }
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }

    //stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    @Override
    public Symbol.Type visitStmtIDChain(PsicoderParser.StmtIDChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + name + "no definida");
            return Symbol.Type.tINVALID;
        }
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }

    @Override
    public Symbol.Type visitStmt2IDChain(PsicoderParser.Stmt2IDChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + name + "no definida");
            return Symbol.Type.tINVALID;
        }
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }

    // exp : ID TK_PUNTO chain
    @Override
    public Symbol.Type visitExpIDChain(PsicoderParser.ExpIDChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if ( var==null )
            return Symbol.Type.tINVALID;
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }

    //chain : ID  TK_PUNTO  chain
    @Override
    public Symbol.Type visitChainIDPunto(PsicoderParser.ChainIDPuntoContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = current.resolve(name);
        if ( var==null )
            return Symbol.Type.tINVALID;
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }

    //chain : ID
    @Override
    public Symbol.Type visitChainID(PsicoderParser.ChainIDContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = current.resolve(name);
        if ( var==null )
            return Symbol.Type.tINVALID;
        if ( var instanceof VariableSymbol )
            return var.type;
        return Symbol.Type.tINVALID;
    }

    private Symbol.Type getNumOperation(Symbol.Type type1, Symbol.Type type2){
        if (type1 == Symbol.Type.tREAL && type1 == type2)
            return Symbol.Type.tREAL;

        if (type1 == Symbol.Type.tREAL && type2 == Symbol.Type.tENTERO)
            return Symbol.Type.tREAL;

        if (type1 == Symbol.Type.tENTERO && type2 == Symbol.Type.tREAL)
            return Symbol.Type.tREAL;

        if (type1 == Symbol.Type.tENTERO && type1 == type2)
            return Symbol.Type.tENTERO;

        if (type1 == Symbol.Type.tENTERO && type2 == Symbol.Type.tCARACTER)
            return Symbol.Type.tENTERO;

        return Symbol.Type.tINVALID;
    }

    private Symbol.Type getNumCompOperation(Symbol.Type type1, Symbol.Type type2){
        if (type1 == Symbol.Type.tREAL && type1 == type2)
            return Symbol.Type.tBOOLEANO;

        if (type1 == Symbol.Type.tENTERO && type1 == type2)
            return Symbol.Type.tBOOLEANO;

        return Symbol.Type.tINVALID;
    }

    //exp -> exp  TK_MAS  exp
    @Override
    public Symbol.Type visitExpMas(PsicoderParser.ExpMasContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        if (type1 == Symbol.Type.tREAL && type1 == type2)
            return Symbol.Type.tREAL;

        if (type1 == Symbol.Type.tREAL && type2 == Symbol.Type.tENTERO)
            return Symbol.Type.tREAL;

        if (type1 == Symbol.Type.tENTERO && type2 == Symbol.Type.tREAL)
            return Symbol.Type.tREAL;

        if (type1 == Symbol.Type.tENTERO && type1 == type2)
            return Symbol.Type.tENTERO;

        if (type1 == Symbol.Type.tCADENA && type1 == type2)
            return Symbol.Type.tCADENA;

        if (type1 == Symbol.Type.tENTERO && type2 == Symbol.Type.tCARACTER)
            return Symbol.Type.tENTERO;

        return Symbol.Type.tINVALID;
    }

    //exp: exp  TK_MENOS  exp       #expMenos
    @Override
    public Symbol.Type visitExpMenos(PsicoderParser.ExpMenosContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        return getNumOperation(type1, type2);
    }

    //exp : exp  TK_MULT  exp        #expMult
    @Override
    public Symbol.Type visitExpMult(PsicoderParser.ExpMultContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        return getNumOperation(type1, type2);
    }

    //exp: exp  TK_DIV  exp     #expDiv
    @Override
    public Symbol.Type visitExpDiv(PsicoderParser.ExpDivContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        return getNumOperation(type1, type2);
    }

    //exp : exp  TK_MOD  exp     #expModulo
    @Override
    public Symbol.Type visitExpModulo(PsicoderParser.ExpModuloContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));

        if (type1 == Symbol.Type.tENTERO && type1 == type2)
            return Symbol.Type.tENTERO;

        return Symbol.Type.tINVALID;
    }

    @Override
    public Symbol.Type visitExpOr(PsicoderParser.ExpOrContext ctx) {
        return Symbol.Type.tBOOLEANO;
    }

    @Override
    public Symbol.Type visitExpAnd(PsicoderParser.ExpAndContext ctx) {
        return Symbol.Type.tBOOLEANO;
    }

    @Override
    public Symbol.Type visitExpIgual(PsicoderParser.ExpIgualContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));

        if (type1 == type2)
            return Symbol.Type.tBOOLEANO;

        return Symbol.Type.tINVALID;
    }

    @Override
    public Symbol.Type visitExpDif(PsicoderParser.ExpDifContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));

        if (type1 == type2)
            return Symbol.Type.tBOOLEANO;

        return Symbol.Type.tINVALID;
    }

    @Override
    public Symbol.Type visitExpMenor(PsicoderParser.ExpMenorContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        return getNumCompOperation(type1, type2);
    }

    @Override
    public Symbol.Type visitExpMenorIgual(PsicoderParser.ExpMenorIgualContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        return getNumCompOperation(type1, type2);
    }

    @Override
    public Symbol.Type visitExpMayor(PsicoderParser.ExpMayorContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        return getNumCompOperation(type1, type2);
    }

    @Override
    public Symbol.Type visitExpMayorIgual(PsicoderParser.ExpMayorIgualContext ctx) {
        Symbol.Type type1 = visit(ctx.exp(0));
        Symbol.Type type2 = visit(ctx.exp(1));
        return getNumCompOperation(type1, type2);
    }

    @Override
    public Symbol.Type visitStmt2LeerChain(PsicoderParser.Stmt2LeerChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + name + "no definida");
            return Symbol.Type.tINVALID;
        }
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }

    //stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    @Override
    public Symbol.Type visitStmt4IDChainAsig(PsicoderParser.Stmt4IDChainAsigContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = DefPhase.currentScope.resolve(name);
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + name + "no definida");
            return Symbol.Type.tINVALID;
        }
        if ( var instanceof StructSymbol ) {
            current = DefPhase.scopes.get(name);
            return visit(ctx.chain());
        }
        return Symbol.Type.tINVALID;
    }
}
