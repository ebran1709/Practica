/**
 * 
 */
package Clases;

/**
 * @author eduardo.bran
 * 
 */
public enum PositionEnum {
    QA_I(1) {
        @Override
        public String Name() {
                return "Quality Assurance";
        }
}, SE_III(5) {
        @Override
        public String Name() {
                return "Software Engeenier";//software
        }
}, PM(10) {
        @Override
        public String Name() {
                return "Project Manager";
        }
};
private int value;

public abstract String Name();

private PositionEnum(int value) {
        this.value = value;
}

}
