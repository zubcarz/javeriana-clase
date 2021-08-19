#include <iostream> 
#include <vector> 

using namespace std;
int main()
{
	vector<int> nums;

	// Add element to vector
	for (int a = 1; a <= 5; a++)
		nums.push_back(a);

	cout << "Output from begin and end: ";
	// Print elements
	for (auto a = nums.begin(); a != nums.end(); ++a)
		cout << *a << " ";


	cout << "\nOutput from cbegin and cend: ";

	for (auto a = nums.cbegin(); a != nums.cend(); ++a)
		cout << *a << " ";

    nums.clear();

    cout << "\nBefore Clear: ";
    for (auto a = nums.cbegin(); a != nums.cend(); ++a)
		cout << *a << " ";


	return 0;
}

