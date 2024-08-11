# Multiple Password Generator

This program is written in Java and allows users to generate multiple strong passwords based on their names. Users can then choose the most suitable password from the generated options.

## How It Works

The program follows these steps to generate multiple passwords:

1. **User Input**:
   - The program first prompts the user to enter their name.

2. **Specify Number of Passwords**:
   - The user is then asked to specify the number of passwords they wish to generate.

3. **Password Generation**:
   - For each password, the program generates a random sequence based on the user's name.
   - The last three characters of the user's name are converted to uppercase and appended to the end of each password.

### Process Details:

- **Random Value Generation**:
  - The program uses a random number generator to create the numeric portion of each password.
  - You can specify the range for these random values, allowing for flexibility in the strength and complexity of the generated passwords.

## Example

If the user inputs the name "Abdul Kalam" and requests five passwords, the program might generate the following:

1. `324512@LAM`
2. `987433@LAM`
3. `564211@LAM`
4. `753196@LAM`
5. `243871@LAM`

Here’s how it works:
- The first part of each password is a randomly generated number.
- The last three characters of "Kalam" ("LAM") are appended in uppercase to each password.

## Conclusion

This Multiple Password Generator provides users with a convenient way to create and choose from several strong passwords. By combining random values with a user-specific name, the program ensures each password is unique, personalized, and secure.

