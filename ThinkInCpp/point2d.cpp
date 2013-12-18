#include "point2d.h"

Point2D::Point2D()
{
    xValue = 0.0;
    YValue = 0.0;
}

Point2D::Point2D(double xVl, double yVl)
{
    x = xVl;
    y = yVl;
}

void Point2D::setX(double xVl)
{
    x = xVl;
}

void Point2D::setY(double yVl)
{
    y = yVl;
}

double Point2D::x() const
{
    return x;
}

double Point2D::y() const
{
    return y;
}