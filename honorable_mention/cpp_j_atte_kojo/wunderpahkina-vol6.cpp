#include <algorithm>
#include <iostream>
#include <iterator>
#include <numeric>
#include <vector>

using namespace std;

int main()
{
    vector<int> heights;
    copy(istream_iterator<int>(cin), istream_iterator<int>(), back_inserter(heights));

    vector<int> widths(heights.size());
    iota(widths.begin(), widths.end(), 0);

    auto begin = heights.cbegin();
    auto end = heights.cend();
    auto p = partition_point(widths.cbegin(), widths.cend(), [=](int width) {
        return search_n(begin, end, width, width, greater_equal<int>()) != end;
    });

    int side = p - widths.cbegin() - 1;
    cout << (side * side) << endl;
}
