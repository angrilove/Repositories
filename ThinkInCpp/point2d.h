#ifndef POINT2D_H
#define POINT2D_H

class Point2D
{
public:
    Point2D();
    Point2D(double xVl, double yVl);

    void setX(double xVl);
    void setY(double yVl);
    double x() const;
    double y() const;

private:
    double x;
    double y;
};

#endif