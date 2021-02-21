import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
import { Home } from "./components/Home";
import { Add } from "./components/Add";
import { Detail } from "./components/Detail";
import { Search } from "./components/Search";
import { Container, Nav, Navbar } from 'react-bootstrap';

function App() {
  return (
    <Router>
      <Navbar bg="light" expand="lg">
      <Navbar.Brand href="/">BookStore</Navbar.Brand>
            <Nav.Item>
            <Link to="/">Home</Link>
            </Nav.Item>
            <Nav.Item>
            <Link to="/list">List Books</Link>
            </Nav.Item>
            <Nav.Item>
            <Link to="/add">Add Books</Link>
            </Nav.Item>
        </Navbar>

        <Container>
        <Switch>
          <Route exact path="/">
            <Home />
          </Route>
          <Route path="/list">
            <Search />
          </Route>
          <Route path="/add">
            <Add />
          </Route>
          <Switch>
            <Route path="/detail/:id" children={<Detail />} />
          </Switch>
        </Switch>
        </Container>
    </Router>
    
  );
}


export default App;
