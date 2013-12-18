#include <string>
#include <iostream>

int main()
{
	std::string test("");
	std::cout << test.empty() << std::endl;
	std::string s, s1;
	if (! s.empty()) {
		std::cout << s.empty() << std::endl;
	}
	
	std::cout << s.empty() << std::endl;
	s = "";
	std::cout << s.empty() << std::endl; // 1
	std::cin >> s >> s1;
	std::cout << s << s1 << std::endl;

	// used constructor initialize string
	std::string ss(s);
	std::string sss("good");
	std::string ssss(9, 'c');

	std::cout << ss << sss << ssss << std::endl;

	// read until end-of-file, writeing each word to a new line
	std::string word;
	while (std::cin >> word) // using ctrl-z exit
	{
		std::cout << word << std::endl;
	}
	return -1;
}
