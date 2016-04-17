
public class GlobalScope extends BaseScope{

    public GlobalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    public Integer counter = 1;

    public Integer getCounter(){
        return counter;
    }

    public void setCounter(Integer i){
        counter = i;
    }

    public String getScopeName() {
        return "globals";
    }
}
