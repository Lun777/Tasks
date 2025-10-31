SELECT Authors.name AS author_name
FROM Authors
LEFT JOIN Books ON Authors.author_id = Books.author_id
LEFT JOIN Orders ON Books.book_id = Orders.book_id
GROUP BY Authors.author_id
HAVING COUNT(Orders.order_id) > 10