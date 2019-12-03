#include <stdio.h>
#include <stdbool.h>
#include <conio.h>

void displayLabObjective();
bool testDiv(int dividend, int divisor);
bool div2(int num);
bool div3(int num);
bool div4(int num);
bool div5(int num);
bool div6(int num);
bool div7(int num);
bool div8(int num);
bool div9(int num);
bool div10(int num);
bool div11(int num);
bool div12(int num);
bool div15(int num);
bool div25(int num);
int getDigits(int num);
int manualModulo(int num, int divisor);

int main()
{
    int x, y;
    char op;

    do
    {
        system("CLS");
        displayLabObjective();

        printf("\nInsert a positive Dividend: ");
        scanf("%d", &x);
        do
        {
            printf("\nInsert another positive Divisor: ");
            scanf("%d", &y);
            if ( (y < 2) || ( (y >12) && ( (y != 15) && (y != 25) ) ) )
                printf("\nInsert either 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15 or 25 as a Divisor!\n");
        }
        while ( (y < 2) || ( (y >12) && ( (y != 15) && (y != 25) ) ) );

        if (testDiv(x, y))
            printf("\n%d is divisible by %d\n", x, y);
        else
            printf("\n%d is NOT divisible by %d\n", x, y);


        do
        {
            printf("\nDo you wish to run another test? ( Y / N )\n");
            op = getche();
        }
        while ( (op != 'y') && (op != 'Y') && (op != 'n') && (op != 'N') );

    }
    while ( (op != 'n') && (op != 'N') );



    return 0;
}
void displayLabObjective()
{
    printf("\nDivisibility Test Program\n");
    printf("\nThe program has the objective of informing if a determined number is or is not divisible by another\n");
    printf("\nThe divisibility tests are valid for the following divisors: 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15 e 25.\n");
}
bool testDiv(int dividend, int divisor)
{
    bool answer;

    if (divisor == 2)
        answer = div2(dividend);
    else if (divisor == 3)
        answer = div3(dividend);
    else if (divisor == 4)
        answer = div4(dividend);
    else if (divisor == 5)
        answer = div5(dividend);
    else if (divisor == 6)
        answer = div6(dividend);
    else if (divisor == 7)
        answer = div7(dividend);
    else if (divisor == 8)
        answer = div8(dividend);
    else if (divisor == 9)
        answer = div9(dividend);
    else if (divisor == 10)
        answer = div10(dividend);
    else if (divisor == 11)
        answer = div11(dividend);
    else if (divisor == 12)
        answer = div12(dividend);
    else if (divisor == 15)
        answer = div15(dividend);
    else if (divisor == 25)
        answer = div25(dividend);
    else
        answer = false;

    return answer;
}
bool div2(int num)
{
    bool answer = false;
    float dummy = (float) num;
    int digits = getDigits(num);
    char str[digits];

    gcvt(dummy, digits, str);

    char last = str[digits-1];

    if(last == '0' || last == '2' || last == '4' || last == '6' || last == '8')
        answer = true;

    return answer;
}
bool div3(int num)
{
    bool answer = false;
    float dummy = (float) num;
    int digits = getDigits(num);

    do
    {
        char str[digits];
        gcvt(dummy, digits, str);
        int result = 0;

        for (int i = 0; i < digits; i++)
        {
            int n;
            char c = str[i];
            sscanf(&c, "%d", &n);
            result += n;
        }
        digits = getDigits(result);
        dummy = (float) result;
    }
    while (digits > 1);

    int result = (int) dummy;

    if(result == 3 || result == 6 || result == 9)
        answer = true;

    return answer;
}
bool div4(int num)
{
    bool answer = false;
    int result;

    if(getDigits(num) < 3)
        result = manualModulo(num, 4);
    else
    {
        float dummy = (float) num;
        int digits = getDigits(num);
        char str[digits];
        gcvt(dummy, digits, str);

        if(str[digits - 1] == '0' && str[digits - 2] == '0')
            answer = true;
        else
        {
            digits = getDigits(num);
            dummy = (float) num;
            char str[digits];
            gcvt(dummy, digits, str);
            result = 0;

            for (int i = digits - 2; i < digits; i++)
            {
                int n;
                char c = str[i];
                sscanf(&c, "%d", &n);
                result += n;
                if(i != digits - 1)
                    result *= 10;
            }

            result = manualModulo(result, 4);
        }
    }
    if(result == 0)
        answer = true;

    return answer;
}
bool div5(int num)
{
    bool answer = false;
    float dummy = (float) num;
    int digits = getDigits(num);
    char str[digits];

    gcvt(dummy, digits, str);

    char last = str[digits-1];

    if(last == '0' || last == '5')
        answer = true;

    return answer;
}
bool div6(int num)
{
    bool by2 = div2(num);
    bool by3 = div3(num);

    return (by2 && by3);
}
bool div7(int num)
{
    bool answer = false;
    float dummy = (float) num;
    int digits = getDigits(num);

    if (digits > 2)
    {
        char str[digits];
        gcvt(dummy, digits, str);

        char lastChar = str[digits-1];
        int last;
        sscanf(&lastChar, "%d", &last);

        num -= last;
        num /= 10;
        last *= 2;
        num -= last;

        do
        {
            dummy = (float) num;
            int digits = getDigits(num);
            char str[digits];
            gcvt(dummy, digits, str);

            char lastChar = str[digits-1];
            sscanf(&lastChar, "%d", &last);

            num -= last;
            num /= 10;
            last *= 2;
            num -= last;
        } while (num > 70);
    }

    for (int i = 1; i < 15; i++)
    {
            if (num == i*7){
                answer = true;
                i = 15;
            }
    }

    return answer;

}
bool div8(int num)
{
    bool answer = false;
    int result;
    int digits = getDigits(num);

    if(digits < 3)
        result = manualModulo(num, 8);
    else
    {
        float dummy = (float) num;
        char str[digits];
        gcvt(dummy, digits, str);

        if(str[digits - 1] == '0' && str[digits - 2] == '0' && str[digits - 3] == '0')
            answer = true;
        else
        {
            result = 0;

            for (int i = digits - 3; i < digits; i++)
            {
                int n;
                char c = str[i];
                sscanf(&c, "%d", &n);
                result += n;
                if(i != digits - 1)
                    result *= 10;
            }

            result = manualModulo(result, 8);
        }
    }
    if(result == 0)
        answer = true;

    return answer;
}
bool div9(int num)
{
    bool answer = false;
    float dummy = (float) num;
    int digits = getDigits(num);
    char str[digits];
    gcvt(dummy, digits, str);
    int result = 0;

    for (int i = 0; i < digits; i++)
    {
        int n;
        char c = str[i];
        sscanf(&c, "%d", &n);
        result += n;
    }

    result = manualModulo(result, 9);

    if(result == 0)
        answer = true;

    return answer;
}
bool div10(int num)
{
    bool answer = false;
    int digits = getDigits(num);
    float dummy = (float) num;

    char str[digits];

    gcvt(dummy, digits, str);

    char last = str[digits-1];

    if(last == '0')
        answer = true;

    return answer;
}
bool div11(int num)
{
    bool answer = false;
    int result = 0;
    int digits = getDigits(num);

    if(digits > 1)
    {
        int odds = 0;
        int evens = 0;

        float dummy = (float) num;
        char str[digits];
        gcvt(dummy, digits, str);

        if (div2(digits)){
            for (int i = 0; i < digits; i++){
                int n;
                char c = str[i];
                sscanf(&c, "%d", &n);
                if (div2(i)) {
                    evens += n;
                } else {
                    odds +=n;
                }
            }
        } else {
            for (int i = 0; i < digits; i++){
                int n;
                char c = str[i];
                sscanf(&c, "%d", &n);
                if (div2(i)) {
                    odds += n;
                } else {
                    evens +=n;
                }
            }
        }

        if((evens - odds) == 0)
            answer = true;
    }

    return answer;
}
bool div12(int num)
{
    bool by3 = div3(num);
    bool by4 = div4(num);

    return (by3 && by4);
}
bool div15(int num)
{
    bool by3 = div3(num);
    bool by5 = div5(num);

    return (by3 && by5);
}
bool div25(int num)
{
    bool answer = false;
    int result = 0;
    int digits = getDigits(num);

    if(digits >= 2)
    {
        float dummy = (float) num;
        char str[digits];
        gcvt(dummy, digits, str);

        for (int i = digits - 2; i < digits; i++)
            {
                int n;
                char c = str[i];
                sscanf(&c, "%d", &n);
                result += n;
                if(i != digits - 1)
                    result *= 10;
            }

        if(result == 0 || result == 25 || result == 50 || result == 75)
            answer = true;
    }

    return answer;
}
int getDigits(int num)
{
    int digits = 1;

    while (num >= 10)
    {
        num /= 10;
        digits ++;
    }

    return digits;
}
int manualModulo(int num, int divisor)
{

    while (num >= divisor)
    {
        num -= divisor;
    }
    return num;
}
