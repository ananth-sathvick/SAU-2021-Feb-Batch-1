const createBook = (id, name, author,publication,date) => ({
    id,
    name,
    author,
    publication,
    date
  })

const bookstore = (books = [], action) => {
  
    switch (action.type) {
      case 'ADD_BOOK':
        console.log(books)
        return [...books, createBook(action.id, action.name, action.author,action.publication,action.date)]
      default:
        return books
    }
  }
  
export default bookstore