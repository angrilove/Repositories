#include <string>
#include <iostream>

int main()
{
	std::string l;

	// read line at time until end-of-file
	while (std::getline(std::cin, l))
	{
		std::cout << l << std::endl;
	}
	return 0;
}
