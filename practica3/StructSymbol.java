import java.util.LinkedHashMap;
import java.util.Map;


public class StructSymbol extends Symbol implements Scope{

    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    Scope enclosingScope;

    public StructSymbol(String name, Symbol.Type retType, Scope enclosingScope) {
        super(name, retType);
        this.enclosingScope = enclosingScope;
    }

    public Symbol resolve(String name) {
        Symbol s = arguments.get(name);
        if ( s!=null )
            return s;

        if ( getEnclosingScope() != null ) {
            return getEnclosingScope().resolve(name);
        }
        return null;
    }

    public void define(Symbol sym) {
        arguments.put(sym.name, sym);
        sym.scope = this;
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public String getScopeName() {
        return name;
    }

    public String toString() {
        return "Estructura"+super.toString()+":"+arguments.values();
    }
}
