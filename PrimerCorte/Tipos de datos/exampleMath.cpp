using namespace std;
#include <stdio.h>      /* printf */
#include <math.h>       /* sqrt */

int main ()
{
  double param, result;
  param = 1024.0;
  result = sqrt (param);
  printf ("sqrt(%f) = %f %f\n", param, result, result );
  return 0;
}