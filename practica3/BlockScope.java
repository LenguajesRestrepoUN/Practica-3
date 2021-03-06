import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BlockScope implements Scope{

    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    Scope enclosingScope;
    String name;
    public Integer counter = 1;

    public Integer getCounter(){
        return counter;
    }

    public void setCounter(Integer i){
        counter = i;
    }

    public BlockScope(String name, Scope scope){
        this.name = name;
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
        return name;
    }

    public String toString() { return "Block<" + name + ">:" + arguments.values(); }
}
