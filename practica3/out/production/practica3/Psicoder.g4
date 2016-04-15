grammar Psicoder;

ps :  element ps   #psElement
    |b              #psB
    |               #psEpsilon
    ;

b :FUNCION_PRINCIPAL statements FIN_PRINCIPAL  #bFuncionPrincipal
    ;

element : FUNCION type ID TK_PAR_IZQ optparams
     TK_PAR_DER HACER statements RETORNAR exp TK_PYC
     FIN_FUNCION                                    #elementFuncion
     | ESTRUCTURA ID statements4 FIN_ESTRUCTURA     #elementEstructura
    ;

type : ENTERO   #typeEntero
    | CARACTER  #typeCaracter
    | CADENA    #typeCadena
    | REAL      #typeReal
    | BOOLEANO  #typeBooleano
    | ID        #typeID
    ;

optparams : params  #optparamsP
    |               #optparamsEpsilon
    ;

params : type ID TK_COMA params #paramsTypeIDComa
    | type ID   #paramsTypeID
    ;

optargs : args  #optargsArgs
     |   #optargsEpsilon
     ;

args : exp TK_COMA args       #argsExpArgs
    | exp       #argsExp
    ;

statements : stmt  statements   #statementsStmt
    |   #statementsEpsilon
    ;

statements3 : stmt2  statements3        #statements3Stmt
    |       #statements3Epsilon
    ;

statements4 : stmt4  statements4        #statements4Stmt
    |       #statements4Epsilon
    ;

stmt : ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC     #stmtCallFunction
    | type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC       #stmtTypeAsig
    | type  ID  TK_COMA  optexp  TK_PYC     #stmtTypeAsigOptexp
    | ID  TK_ASIG  exp  TK_PYC      #stmtIDAsig
    | type  ID  TK_ASIG  exp  TK_PYC        #stmtTypeAsifExp
    | ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC     #stmtIDChain
    | type  ID  TK_PYC      #stmtID
    | SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements  FIN_SI     #stmtSi
    | SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements SI_NO  statements  FIN_SI       #stmtSiNo
    | LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC      #stmtLeerID
    | LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC     #stmtLeerChain
    | IMPRIMIR  TK_PAR_IZQ  imp_params  TK_PAR_DER  TK_PYC      #stmtImprimir
    | PARA  TK_PAR_IZQ  stmt  exp  TK_PYC  exp TK_PAR_DER  HACER  statements3  FIN_PARA     #stmtPara
    | MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER statements3  FIN_MIENTRAS        #stmtMientras
    | HACER  statements3  MIENTRAS  TK_PAR_IZQ  exp TK_PAR_DER  TK_PYC      #stmtHacer
    | SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases FIN_SELECCIONAR     #stmtSeleccionar
    ;

cases : CASO  exp  TK_POSD  statements3  cases2 #casesCaso
    | deft  #casesDefecto
    ;

cases2 : CASO  exp  TK_POSD  statements3  cases2    #cases2cacso
    |   #cases2Epsilon
    | deft  #cases2Defecto
    ;

deft : DEFECTO  TK_POSD  statements3
    ;

imp_params : exp  TK_COMA  imp_params       #imp_paramsChain
    | exp   #imp_paramsExp
    ;

optexp : ID  TK_COMA  optexp    #optexpIDComa
    | ID  TK_ASIG  exp  TK_COMA  optexp #optexpIDAsigExpComa
    | ID    #optexpID
    | ID  TK_ASIG  exp  #optexpIDAsigExp
    ;

chain : ID  TK_PUNTO  chain #chainIDPunto
    | ID    #chainID
    ;

exp :  TK_CARACTER      #expCaracter
    |  ID       #expID
    |  ID  TK_PUNTO  chain      #expIDChain
    |  TK_ENTERO        #expEntero
    |  TK_REAL      #expReal
    |  TK_CADENA        #expCadena
    |  VERDADERO        #expVerdadero
    |  FALSO        #expFalso
    |  TK_MENOS  TK_REAL        #expMenosReal
    |  TK_MENOS  TK_ENTERO      #expMenosEntero
    |  TK_MENOS  ID     #expMenosID
    |  TK_MENOS  ID  TK_PUNTO  chain        #expIDChain
    |  TK_MENOS  TK_PAR_IZQ  exp  TK_PAR_DER        #expParExp
    |  TK_NEG  ID       #expNegID
    |  TK_NEG  ID  TK_PUNTO  chain      #expNegChain
    |  TK_NEG  VERDADERO        #expNegVerdadero
    |  TK_NEG  FALSO        #expNegFalso
    |  TK_NEG  TK_PAR_IZQ  exp  TK_PAR_DER      #expNegParExp

    |  TK_PAR_IZQ  exp  TK_PAR_DER      #expParExp
    |  ID  TK_PAR_IZQ  optargs  TK_PAR_DER      #expFuncion

    |  exp  TK_O  exp       #expOr
    |  exp  TK_Y  exp       #expAnd
    |  exp  TK_IGUAL  exp       #expIgual
    |  exp  TK_MENOR  exp       #expMenor
    |  exp  TK_MAYOR  exp       #expMayor
    |  exp  TK_MENOR_IGUAL  exp     #expMenorIgual
    |  exp  TK_MAYOR_IGUAL  exp     #expMayorIgual
    |  exp  TK_DIF  exp     #expDif

    |  exp  TK_MAS  exp     #expMas
    |  exp  TK_MENOS  exp       #expMenos
    |  exp  TK_MULT  exp        #expMult
    |  exp  TK_DIV  exp     #expDiv
    |  exp  TK_MOD  exp     #expModulo
    ;

stmt2 : ROMPER  TK_PYC  #stmt2Romper
    |  ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC #stmt2CallFunction
    |  type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC  #stmt2TypeAsig
    |  type  ID  TK_COMA  optexp  TK_PYC    #stmt2TypeAsigOptexp
    |  ID  TK_ASIG  exp  TK_PYC #stmt2IDAsig
    |  type  ID  TK_ASIG  exp  TK_PYC   #stmt2TypeAsifExp
    |  ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC    #stmt2IDChain
    |  type  ID  TK_PYC #stmt2ID
    |  SI  TK_PAR_IZQ  exp  TK_PAR_DER ENTONCES  statements3  FIN_SI #stmt2Si
    |  SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements3 SI_NO  statements3  FIN_SI    #stmt2SiNo
    |  LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC    #stmt2LeerID
    |  LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC #stmt2LeerChain
    |  IMPRIMIR  TK_PAR_IZQ  imp_params  TK_PAR_DER  TK_PYC #stmt2Imprimir
    |  PARA  TK_PAR_IZQ  stmt  exp  TK_PYC  exp TK_PAR_DER  HACER  statements3  FIN_PARA  #stmt2Para
    |  MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER statements3  FIN_MIENTRAS #stmt2Mientras
    |  HACER  statements3  MIENTRAS  TK_PAR_IZQ  exp TK_PAR_DER  TK_PYC    #stmt2Hacer
    |  SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases FIN_SELECCIONAR   #stmt2Seleccionar
    ;

stmt4 : ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC        #stmt4Funcion
    |  type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC      #stmt4TypeIDAsigComa
    |  type  ID  TK_COMA  optexp  TK_PYC        #stmt4TypeIDComa
    |  ID  TK_ASIG  exp  TK_PYC     #stmt4IDAsig
    |  type  ID  TK_ASIG  exp  TK_PYC       #stmt4TypeIDAsig
    |  ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC        #stmt4IDChainAsig
    |  type  ID  TK_PYC     #stmt4TypeID
    ;


FIN_FUNCION : 'fin_funcion'
    ;

LEER : 'leer'
    ;

SI_NO : 'si_no'
    ;

SI : 'si'
    ;

ENTONCES: 'entonces'
    ;

FIN_SI: 'fin_si'
    ;

MIENTRAS: 'mientras'
    ;

HACER: 'hacer'
    ;

FIN_MIENTRAS: 'fin_mientras'
    ;

PARA: 'para'
    ;

FIN_PARA: 'fin_para'
    ;

SELECCIONAR: 'seleccionar'
    ;

ENTRE : 'entre'
    ;

CASO : 'caso'
    ;

ROMPER :  'romper'
    ;

DEFECTO : 'defecto'
    ;

FIN_SELECCIONAR : 'fin_seleccionar'
    ;

RETORNAR : 'retornar'
    ;

ESTRUCTURA : 'estructura'
    ;

FIN_ESTRUCTURA : 'fin_estructura'
    ;

IMPRIMIR : 'imprimir'
    ;

CARACTER : 'caracter'
    ;

CADENA : 'cadena'
    ;

FUNCION_PRINCIPAL : 'funcion_principal'
    ;

FUNCION : 'funcion'
    ;

FIN_PRINCIPAL : 'fin_principal'
    ;

BOOLEANO : 'booleano'
    ;

TK_CARACTER: '\''(('A'..'Z')|('a'..'z')|('0'..'1'))'\''
    ;

VERDADERO: 'verdadero'
    ;

FALSO: 'falso'
    ;

REAL : 'real'
    ;

ENTERO : 'entero'
    ;

TK_ENTERO : ('0'..'9')+
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

TK_MAS: '+'
    ;

TK_MENOS: '-'
    ;

TK_MULT: '*'
    ;

TK_DIV: '/'
    ;

TK_MOD: '%'
    ;

TK_ASIG: '='
    ;

TK_MENOR: '<'
    ;

TK_MAYOR: '>'
    ;

TK_MENOR_IGUAL: '<='
    ;

TK_MAYOR_IGUAL: '>='
    ;

TK_IGUAL: '=='
    ;

TK_Y: '&&'
    ;

TK_O: '||'
    ;

TK_DIF: '!='
    ;

TK_NEG: '!'
    ;

TK_POSD: ':'
    ;

TK_COMILLA_SEN: '\''
    ;

TK_COMILLA_DOB: '"'
    ;

TK_PYC: ';'
     ;

TK_COMA: ','
     ;

TK_PUNTO: '.'
    ;

TK_PAR_IZQ: '('
    ;

TK_PAR_DER: ')';

ID : (('a'..'z')|('A'..'Z'))+(('A'..'Z')|('a'..'z')|('0'..'9')|('_'))*;

//TK_CADENA: '"'(('A'..'Z')|('a'..'z')|('0'..'1')|'_'|(' '))*'"';

TK_REAL : ('0'..'9')+'.'('0'..'9')+;
TK_CADENA: '"'([a-zA-Z0-9_  \\])*'"';