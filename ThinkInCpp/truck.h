#ifndef TRUCK_H
#define TRUCK_H

class Truck
{
public:
    Truck() // 构造函数constructor
    {
        ++counter;
    }

    ~Truck() // 析构函数destructor
    {
        --counter;
    }
    static int instanceCount()
    {
        return counter;
    }

private:
    static int counter;
};

#endif