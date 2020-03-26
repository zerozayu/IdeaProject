package Exception;

/**
 * @author zhangyu
 * @date 2020/3/18 - 23:05
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -4603336312452123863L;

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
