import React, { useState } from 'react'
import { useSelector, useDispatch } from 'react-redux'
import { addBook } from '../redux/actions'
import { useHistory } from "react-router-dom";
import { Button, Form } from 'react-bootstrap';


export const Add = () => {
  const books = useSelector((state) => state.bookstore) || []
  const dispatch = useDispatch()
  const [name, setName] = useState('')
  const [author, setAuthor] = useState('')
  const [date, setDate] = useState('')
  const [publication, setPublication] = useState('')
  let history = useHistory();



  return (

    <div>
      <h1>ADD Book</h1>

      <Form.Group controlId="formBasicEmail">
        <Form.Label>Book name</Form.Label>
        <Form.Control onInput={(e) => setName(e.target.value)} type="text" placeholder="Enter bookname" />
      </Form.Group>

      <Form.Group controlId="formBasicEmail">
        <Form.Label>Author name</Form.Label>
        <Form.Control   onInput={(e) => setAuthor(e.target.value)} type="text" placeholder="Enter Author name" />
      </Form.Group>

      <Form.Group controlId="formBasicEmail">
        <Form.Label>Publication</Form.Label>
        <Form.Control  onInput={(e) => setPublication(e.target.value)} type="text" placeholder="Enter Publication" />
      </Form.Group>

    
      <Form.Group controlId="formBasicEmail">
        <Form.Label>Date</Form.Label>
        <Form.Control  onInput={(e) => setDate(e.target.value)} type="text" placeholder="Enter Date" />
      </Form.Group>

      <Button onClick={() => { dispatch(addBook(name, author, publication,date)); history.push('/list') }}>Add</Button>
    </div>
  );
}