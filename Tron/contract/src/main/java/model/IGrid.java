package model;

public interface IGrid {
    int getHeight();

    int getWidth();

    public IMotionLess getMatrixXY(int x, int y);

    public void setMatrixXY(final IMotionLess motionLess, final int x, final int y);
}
