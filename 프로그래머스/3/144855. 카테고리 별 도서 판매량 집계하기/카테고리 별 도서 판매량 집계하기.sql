-- 코드를 입력하세요
SELECT CATEGORY, SUM(SALES) TOTAL_SALES
FROM BOOK AS B
JOIN BOOK_SALES AS S
ON B.BOOK_ID = S.BOOK_ID
WHERE DATE_FORMAT(S.SALES_DATE, "%Y-%m") = "2022-01"
GROUP BY CATEGORY
ORDER BY CATEGORY