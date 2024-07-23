-- 코드를 입력하세요
SELECT DATE_FORMAT(O.SALES_DATE, "%Y") YEAR, DATE_FORMAT(O.SALES_DATE, "%m") MONTH, 
U.GENDER GENDER, COUNT(DISTINCT O.USER_ID) USER
FROM USER_INFO AS U
JOIN ONLINE_SALE AS O
ON U.USER_ID = O.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR, MONTH, GENDER
ORDER BY YEAR, MONTH, GENDER