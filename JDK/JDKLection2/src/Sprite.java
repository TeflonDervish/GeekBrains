import java.awt.*;

public abstract class Sprite {
    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;

    protected float getLeft() { return x - halfWidth; }
    protected float getRight() { return x + halfWidth; }
    protected float getTop() { return y - halfWidth; }
    protected float getBottom() { return y + halfWidth; }

    protected void setLeft(float left) { x = left + halfWidth; }
    protected void setRight(float right) { x = right + halfWidth; }
    protected void setTop(float top) { x = top + halfWidth; }
    protected void setBottom(float bottom) { x = bottom + halfWidth; }

    protected float getWidth() { return 2f * halfWidth; }
    protected float getHeight() { return 2f * halfHeight; }

    void update(MainCanvas canvas, float deltaTime) {}
    void render(MainCanvas canvas, Graphics g) {}
}
