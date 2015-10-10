def text_in(filename):
    results = []
    with open(filename) as infile:
        for line in infile:
            results.append(line.strip().split())
    return results

def str_to_num(inp):
    for line in inp:
        for i in range(len(line)):
            line[i] = int(line[i])
    return inp

def solve(inp):
    inp.reverse()
    for i in range(len(inp) - 1):
        for j in range(len(inp[i]) - 1):
            if inp[i][j] > inp[i][j + 1]:
                inp[i + 1][j] += inp[i][j]
            else:
                inp[i + 1][j] += inp[i][j + 1]
    return inp

def main():
    strs = text_in('triangle.txt')
    nums = str_to_num(strs)
    sol = solve(nums)
    for line in sol:
        print(line)
