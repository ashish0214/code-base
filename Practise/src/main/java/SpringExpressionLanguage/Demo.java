package SpringExpressionLanguage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class Demo {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
