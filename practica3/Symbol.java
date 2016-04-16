
public class Symbol {

    public static enum Type {tINVALID, tENTERO, tREAL, tCADENA, tCARACTER, tESTRUCTURA, tBOOLEANO, tID}

    String name;
    Type type;
    Scope scope;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this(name);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if ( type != Type.tINVALID )
            return '<'+getName()+":"+type+'>';
        return getName();
    }
}
