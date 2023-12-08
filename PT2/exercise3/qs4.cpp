#include <iostream>
using namespace std;

int main()
{
    // declaration
    string fullName, title;
    int year;
    // input
    cout << "Enter author of the book ->";
    getline(cin, fullName);
    cout << "Enter year of publised -> ";
    cin >> year;
    cin.ignore();
    cout << "Enter a book title -> ";
    getline(cin, title);
    // process
    int findSpace = fullName.find(' ');
    string firstName, lastName;
    if (findSpace != string::npos)
    {
        firstName = fullName.substr(0, findSpace);
        lastName = fullName.substr(findSpace + 1);
    }
    // output
    cout << endl;
    cout << lastName << ", " << firstName << " (" << year << ") " << title << endl;
    return 0;
}
