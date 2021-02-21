import React from "react";
import { useParams } from 'react-router-dom'
import { useSelector, useDispatch } from 'react-redux'
import findWithAttr from '../Helper'


export const Detail = () => {
    let { id } = useParams();
    const books = useSelector((state) => state.bookstore) || []
    let selected = findWithAttr(books,'id',id);
  
    return (
      <div>
        <h3>Book ID: {selected.id}</h3>
        <h1>Name {selected.name}</h1>
        <h2>Author -  {selected.author}</h2>
        <h2>Date -  {selected.date}</h2>
        <h4>Publication -  {selected.publication}</h4>
      </div>
    );
}

