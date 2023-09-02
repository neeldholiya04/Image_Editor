# Java Image Manipulation Program

## Overview

This Java program is designed to perform a variety of image manipulation operations on a given input image. It provides options to convert an image to grayscale, change its brightness, rotate it clockwise or counterclockwise, flip it horizontally, or flip it vertically. This README provides comprehensive information on how to use the program, its structure, supported operations, dependencies, and sample usage.

## Program Structure

The program is organized into a single Java class named `index`. It contains both static methods for image manipulation and a `main` method that serves as the entry point. Here's an overview of the program's structure:

### Static Methods

1. **convertToGrayScale(BufferedImage inputImage)**
   - Converts the input color image to grayscale.
   - Parameters:
     - `inputImage` (BufferedImage): The input color image to be converted.
   - Returns:
     - A grayscale `BufferedImage`.

2. **changeBrightness(BufferedImage inputImage, int increase)**
   - Changes the brightness of the input color image by a specified     percentage.
   - Parameters:
     - `inputImage` (BufferedImage): The input color image to be modified.
     - `increase` (int): The percentage by which to increase or decrease brightness.
   - Returns:
     - A modified `BufferedImage` with adjusted brightness.

3. **rotateClockwise(BufferedImage inputImage)**
   - Rotates the input image 90 degrees clockwise.
   - Parameters:
     - `inputImage` (BufferedImage): The input image to be rotated.
   - Returns:
     - A rotated `BufferedImage`.

4. **rotateAntiClockwise(BufferedImage inputImage)**
   - Rotates the input image 90 degrees counterclockwise.
   - Parameters:
     - `inputImage` (BufferedImage): The input image to be rotated.
   - Returns:
     - A rotated `BufferedImage`.

5. **flipHorizontal(BufferedImage inputImage)**
   - Flips the input image horizontally (left to right).
   - Parameters:
     - `inputImage` (BufferedImage): The input image to be flipped.
   - Returns:
     - A horizontally flipped `BufferedImage`.

6. **flipVertical(BufferedImage inputImage)**
   - Flips the input image vertically (top to bottom).
   - Parameters:
     - `inputImage` (BufferedImage): The input image to be flipped.
   - Returns:
     - A vertically flipped `BufferedImage`.
7. **blurImage(BufferedImage inputImage, int blurFactor)**
   - This method applies a blur effect to the input image by averaging the colour values of nearby pixels. The degree of blurring is determined by the ‘blurFactor’, which specifies the radius around each pixel to consider when calculating the average colour.
   - Parameters:
      - ‘inputImage’ (BufferedImage): The input image is to be blurred.
      - ‘blurFactor’ (int): The radius around each pixel to        consider when calculating the average colour. A higher value results in a stronger blur effect.
   - Returns:
      - A blurred ‘BufferedImage’ with the same dimension as the input image.

### Main Method

- The `main` method serves as the entry point of the program.
- It provides a command-line interface for users to select an image manipulation option and input any required parameters.
- Supported operations include:
   1. Convert to grayscale
   2. Change brightness
   3. Rotate clockwise
   4. Rotate counterclockwise
   5. Flip horizontally
   6. Flip vertically
   7. Blur Image
- The modified image is saved as "OutputImage.jpg" in the program's directory.

## Supported Operations

The program supports the following image manipulation operations:

1. **Convert to Grayscale**
   - Converts the input image to grayscale.

2. **Change Brightness**
   - Adjusts the brightness of the input image by a specified percentage.
   - Additional Input Required: Percentage adjustment.

3. **Rotate Clockwise**
   - Rotates the input image 90 degrees clockwise.

4. **Rotate Counterclockwise**
   - Rotates the input image 90 degrees counterclockwise.

5. **Flip Horizontally**
   - Flips the input image horizontally (left to right).

6. **Flip Vertically**
   - Flips the input image vertically (top to bottom).

7. **Blur Factor**
   - Blur the input image by specified blur factor.
   - Additional Input Required: Blur Factor.


## Usage Instructions

Follow these steps to use the program:

1. **Compile and Run the Program**:
   - Compile the program using `javac index.java`.
   - Run the program using `java index`.

2. **Select an Operation**:
   - Choose one of the image manipulation options by entering the corresponding number.

3. **Provide Additional Input**:
   - If required by the selected operation, follow the prompts to provide additional input (e.g., brightness adjustment percentage).

4. **View the Modified Image**:
   - The modified image will be saved as "OutputImage.jpg" in the program's directory.

## Dependencies

The program relies on the following dependencies:

- `java.awt.Color` class for color manipulation.
- `java.awt.image.BufferedImage` for image handling.
- `javax.imageio` package for reading and writing images.

## Sample Usage

Here are examples of how to use the program for different operations:

1. To convert an image to grayscale, enter `1`.
2. To change the brightness, enter `2`, and provide the percentage adjustment.
3. To rotate clockwise, enter `3`.
4. To rotate counterclockwise, enter `4`.
5. To flip horizontally, enter `5`.
6. To flip vertically, enter `6`.
7. To blur the image, enter '7', and provide blur factor.

## Notes

- Ensure that the input image file is named "43911.jpg" and is located in the same directory as the program for the operations to work.
- This program provides a straightforward command-line interface for performing basic image processing tasks. It can be useful for simple image manipulation needs.

---
