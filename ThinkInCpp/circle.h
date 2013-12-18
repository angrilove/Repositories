#ifndef CIRCLE_H
#define CIRCLE_H

#include "shape.h"

class Circle : public Shape
{
public:
    Circle(Point2D p, double rdi = 0.5) : Shape(p)
    {
        radius = rdi;
    }

    void draw()
    {
        // do someting here
    }

private:
    double radius; // error: double radius = 0.5;
};

#endif