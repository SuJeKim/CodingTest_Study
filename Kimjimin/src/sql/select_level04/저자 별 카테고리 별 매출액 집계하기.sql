<<<<<<< HEAD
SELECT b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY,
        SUM(bs.SALES * b.price) as TOTAL_SALES
from AUTHOR a, BOOK b, BOOK_SALES bs
WHERE A.AUTHOR_ID = B.AUTHOR_ID
AND B.BOOK_ID = BS.BOOK_ID
AND TO_CHAR(BS.SALES_DATE,'YYYYMM') = '202201'
GROUP BY b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
=======
SELECT b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY,
        SUM(bs.SALES * b.price) as TOTAL_SALES
from AUTHOR a, BOOK b, BOOK_SALES bs
WHERE A.AUTHOR_ID = B.AUTHOR_ID
AND B.BOOK_ID = BS.BOOK_ID
AND TO_CHAR(BS.SALES_DATE,'YYYYMM') = '202201'
GROUP BY b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
>>>>>>> 71dad5660a201ca0588f83814ce552f2c3047713
ORDER BY b.AUTHOR_ID, b.CATEGORY DESC