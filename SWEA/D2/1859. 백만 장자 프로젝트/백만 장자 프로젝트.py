T = int(input())

for test_case in range(1, T + 1):
    # 입력: 자연수 N 및 각 날의 매매가
    N = int(input())
    prices = list(map(int, input().split()))

    # 초기 이익과 현재까지의 최댓값 초기화
    profit = 0
    max_price = 0

    # 뒤에서부터 탐색하며 최대 이익 계산
    for i in range(N - 1, -1, -1):
        if prices[i] > max_price:
            max_price = prices[i]
        else:
            profit += max_price - prices[i]

    # 결과 출력
    print("#{} {}".format(test_case, profit))
