let bookId = 0

export const addBook = (name,author,publication,date) => {
    return { type: 'ADD_BOOK', id:bookId++, name,author,publication,date }
}