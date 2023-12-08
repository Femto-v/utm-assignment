#include <iostream>
using namespace std;

int main()
{

    // programming qs 2
    // declare string
    string qs2 = "Programming is a subject!";
    cout << qs2 << endl;
    // insert "good"
    qs2.insert(17, "good ");
    cout << qs2 << endl;
    // replace
    // finding start location of "is a good sub"
    size_t pos = qs2.find("is a good sub");
    // if find then do the replace
    if (pos != string::npos)
    {
        qs2.replace(pos, 13, "re");
    }
    cout << qs2 << endl;
    return 0;
}
