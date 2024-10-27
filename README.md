# Web Application with Spring Boot, Spring AI, OpenAI, and ReactJS

This web application enables users to interact with three AI-powered services through an easy-to-use interface. Built with a Spring Boot backend and a ReactJS frontend, it provides features to generate images, ask questions, and receive recipe suggestions based on user inputs.

## Features

### 1. Image Generator
- Users can enter a prompt to generate images on their specified theme.
- Using OpenAI's image generation capabilities, the app creates unique images based on the input text.
- Images are displayed in the panel below the prompt box.

### 2. Ask AI
- Users can ask questions or request information on any topic.
- This tab leverages OpenAI's language models to provide detailed, conversational responses to user queries.

### 3. Recipe Generator
- Allows users to enter specific requirements or ingredients to generate personalized recipes.
- The AI suggests recipes based on the user's input, providing a tailored cooking experience.

## Tech Stack

### Backend
- **Spring Boot**: Provides a robust and scalable backend for handling requests and responses across the application.
- **Spring AI Integration**: Allows seamless integration with OpenAI, making it easy to manage API calls and data flow.
- **OpenAI API**: Powers the AI-based image generation, question-answering, and recipe generation functionalities.

### Frontend
- **ReactJS**: Delivers a responsive and interactive user interface, with separate tabs for each feature.
- **CSS**: Styles the application to provide a clean, user-friendly experience.

## How It Works

1. **User Interface (ReactJS)**: The application has three main tabs in the UI:
   - **Image Generator**: Users can type a prompt, and clicking "Generate Image" sends the request to the backend, which communicates with OpenAI to fetch the image.
   - **Ask AI**: Accepts a user query and responds with an AI-generated answer, enhancing user engagement.
   - **Recipe Generator**: Suggests recipes based on ingredients or cooking preferences entered by the user.

2. **Backend Services (Spring Boot and OpenAI)**:
   - The backend captures user inputs and sends requests to the OpenAI API via Spring AI.
   - Results from OpenAI are formatted and returned to the React frontend, where they are displayed in the corresponding tab.

## Installation

1. Clone the repository:
     ```bash
     git clone <repository-url>

2. Backend:
    - Navigate to the backend directory.
    - Install dependencies and start the Spring Boot application:
    ```bash
    mvn clean install
    mvn spring-boot:run

3. Frontend:
    - Navigate to the frontend directory.
    - Install dependencies and start the React application:
    ```bash
    npm install
    npm start

4. Environment Variables:
    - Ensure OpenAI API keys are set in your backend’s environment for secure access to AI services.

## Usage

  - **Image Generation**: Enter a phrase or theme in the text box, and press "Generate Image" to get a customized image.
  - **Ask AI**: Input a question or request, and press "Ask AI" to get a response.
  - **Recipe Generation**: Specify ingredients or preferences in the Recipe Generator tab, and get a list of potential recipes.

## Screenshots

![Main](https://github.com/user-attachments/assets/542600ad-4252-4c04-aa83-1c2ebc13f84d)
