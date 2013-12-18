#ifndef LABELEDCIRCLE_H
#define LABELEDCIRCLE_H

#include <string>
#include "circle.h"

class LabeledCircle : public Circle
{
public:
    void draw() 
    {
        Circle::draw(); // 调用基类的方法
        drawLabel();
    }

    void drawLabel()
    {
        // drawLabel
    }

private:
    std::string label;
};
#endif