
public class LocalScope extends BaseScope{

    public LocalScope(Scope parent) {
        super(parent);
    }

    public String getScopeName() {
        return "locals";
    }

    public Integer counter = 1;

    public Integer getCounter(){
        return counter;
    }

    public void setCounter(Integer i){
        counter = i;
    }
}
