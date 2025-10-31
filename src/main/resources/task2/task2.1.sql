SELECT Books.title, Authors.name
FROM Books
INNER JOIN Authors ON
    Books.author_id = Authors.author_id