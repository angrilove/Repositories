#include "truck.h"

/*
 * 静态变量必须在 .cpp 或 .cxx 或 .cc 中定义，
 * 否则编译器会报错。
 * 但是不能有 static 关键字，要在 .h 文件中定义。
 * 详见： truck.h
 */
int Truck::counter = 0;
