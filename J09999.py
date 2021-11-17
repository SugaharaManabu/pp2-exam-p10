from time import time

def solve(n):
    """Project Euler #10を解く !Attention! このコードは遅いです。提出には使えないので注意してください。"""
    list_ = [0] * (n+1)
    for i in range(2,n+1):
        for j in range(2,i):
            if i % j == 0:
                break
        else:
            list_[i] = 1
    
    sum=0
    for i in range(2,n+1):
        if list_[i] == 1:
            sum += i
        
    return sum

if __name__ == '__main__':
    start = time()
    print(solve(10))
    assert 17 == solve(10)
    end = time()
    print(end - start)
    
    # 公開時は削除してください。
    assert 1060 == solve(100)
    assert 76127 == solve(1000)
    
    print('---')
    # 公開時は削除してください。

    start = time()
    num = solve(2000000)
    print(num)
    end = time()
    print(end - start)

