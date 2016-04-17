import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BlockScope implements Scope{

    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    Scope enclosingScope;

    public BlockScope(Scope scope){
        enclosingScope = scope;
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
        return "Block Scope";
    }

    public String toString() {
        return "Block Scope" + super.toString() + ":" + arguments.values();
    }
}
