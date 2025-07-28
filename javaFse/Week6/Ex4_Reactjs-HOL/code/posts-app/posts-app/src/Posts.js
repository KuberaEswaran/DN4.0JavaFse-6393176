import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => {
        console.error('Error fetching posts:', error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h2>Posts List</h2>
        <ul>
          {this.state.posts.map((post) => (
            <li key={post.id}>
              <strong>{post.title}</strong><br />
              {post.body}
            </li>
          ))}
        </ul>
      </div>
    );
  }
}

export default Posts;
