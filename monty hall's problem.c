#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <time.h>
#include <string.h>
int main() {
	srand(time(NULL));
	int n, win = 0, tmp, answer, goat = 0;
	printf("시도할 횟수를 입력하시오:");
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		answer = rand() % 3; //정답 위치
		tmp = rand() % 3; //고른 위치
		for (int j = 0; j < 3; j++) {
			if (j != answer && j != tmp) {
				goat = j; //염소가 있는 위치
				break;
			}
		}
		for (int j = 0; j < 3; j++) {
			if (j != tmp && j != goat) {
				tmp = j; //위치변경
				if (tmp == answer)
					win++;
				break;
			}
		}
	}
	printf("몬티홀의 문제에 따라 선택을 바꿀경우 차가있을 경우는 \n%lf%%입니다.", win / (double)n * 100);
}
