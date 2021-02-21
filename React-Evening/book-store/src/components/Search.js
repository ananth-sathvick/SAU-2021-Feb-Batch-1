import React, { useState } from "react";
import { useSelector, useDispatch } from 'react-redux'
import { findWithAttrs } from "../Helper";
import { Link } from "react-router-dom";
import { Form , Table } from "react-bootstrap";


export const Search = () => {
    const [input, setInput] = useState("");
    const allBooks = useSelector((state) => state.bookstore) || []

    let result = findWithAttrs(allBooks, 'name', input).map((book, i) =>
        <tr key={i}>
            <td>{i + 1}</td>
            <td>
            <Link to={"/detail/" + book.id}>
                {book.name}
            </Link></td>
            <td>{book.author}</td>
        </tr>
    );
    console.log(allBooks);
    return (
        <div>
            <h1>Book List</h1>
            <h6>Click on title for more details</h6>
            <Form.Group controlId="formBasicEmail">
                <Form.Label>Search book</Form.Label>
                <Form.Control onInput={(e) => setInput(e.target.value)} type="text" placeholder="Search for books" />
            </Form.Group>
            <Table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Book name</th>
                        <th>Book Author</th>
                    </tr>
                </thead>
                <tbody>
                    {result}
                </tbody>
            </Table>

        </div>

    )
}