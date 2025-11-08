def factorial(n: int) -> int:
    fact = 1
    for i in range(1, n+1):
        fact = fact * i
    
    return fact


def binomialCoeff(n: int, r: int) -> int:
    fact_n = factorial(n)
    fact_r = factorial(r)
    fact_nmr = factorial(n-r)

    bio_coeff = fact_n // (fact_r * fact_nmr)
    return bio_coeff


print(binomialCoeff(6, 3))
