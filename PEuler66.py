import math
def find_cont(num):
    a0 = math.floor(math.sqrt(num))
    res = [a0]
    d0 = 1
    m0 = 0
    m1 = d0*a0-m0
    d1 = (num - m1**2)/d0
    a1 = math.floor((a0+m1)/d1)
    res.append(a1)
    mn = m1
    dn = d1
    an = a1
    mn1 = dn * an - mn
    dn1 = ((num - mn1**2)/dn)
    an1 = math.floor((a0 + mn1)/dn1)
    while (mn1 != m1 or dn1 != d1 or an1 != a1):
        res.append(an1)
        mn = mn1
        dn = dn1
        an = an1
        mn1 = dn * an - mn
        dn1 = ((num - mn1**2)/dn)
        an1 = math.floor((a0 + mn1)/dn1)
    return res

#should return tuple of fraction pair
def eval_cont(in_list, iters):
    first = in_list[0]
    in_list.remove(first)
    if (len(in_list) < iters):
        times = math.ceil(iters/len(in_list))
        in_list *= times
    if (len(in_list) > iters):
        in_list = in_list[:iters]
    in_list.reverse()
    in_list.append(first)
    numer = 1
    denom = in_list[0]
    in_list = in_list[1:]
    for elt in in_list:
        temp_n = numer
        numer = denom
        denom = denom * elt + temp_n
    return (denom, numer)

#num must be a positive, non-perfect square integer
def pell(num):
    frac = find_cont(num)
    min_x = -5
    counter = 1
    while(True):
        temp_f = list(frac)
        (numer, denom) = eval_cont(temp_f, counter)
        if numer**2 - (num * (denom**2)) == 1:
            min_x = numer
            break
        counter += 1
    return min_x

def order66(d_param):
    largest = 0
    result = 0,0
    for i in range(2,d_param+1):
        if (i % (i**.5) != 0):
            temp = pell(i)
            if (temp > largest):
                largest = temp
                result = i, largest
    print(result)
