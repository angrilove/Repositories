#include <iostream>

int main()
{
    const char string[] = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '\0'};
    const char str[] = "Hello world!";
    const char *s = "Hello world!";

    std::cout << string << std::endl;
    std::cout << str << std::endl;
    std::cout << s << std::endl;
    std::cout << "Hello world!" << std::endl;
    return 0;
}