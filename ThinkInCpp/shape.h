#ifndef SHAPE_H
#define SHAPE_H

#include "pint2d.h"

class Shape
{
public:
    Shape(Point2D p)
    {
        point2d = p;
    }

    virtual void draw() = 0; // 定义纯虚函数

protected:
    Point2D point2d;
};

#endif