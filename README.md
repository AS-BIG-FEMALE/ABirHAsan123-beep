| Rank | THING-TO-RANK |
|-----:|---------------|
|4.0  1| 📣            |
|5.0  2| 📚            |
|6.0  3| 🌟            |
|7.0  4| 🌱            |
|8.0  5| 💞            |

# import {expect} from '@jest/globals';

function toBeWithinRange(actual, floor, ceiling) {
  if (
    typeof actual !== 'number' ||
    typeof floor !== 'number' ||
    typeof ceiling !== 'number'
  ) {
    throw new TypeError('These must be of type number!');
  }

  const pass = actual >= floor && actual <= ceiling;
  if (pass) {
    return {
      message: () =>
        `expected ${this.utils.printReceived(
          actual,
        )} not to be within range ${this.utils.printExpected(
          `${floor} - ${ceiling}`,
        )}`,
      pass: true,
    };
  } else {
    return {
      message: () =>
        `expected ${this.utils.printReceived(
          actual,
        )} to be within range ${this.utils.printExpected(
          `${floor} - ${ceiling}`,
        )}`,
      pass: false,
    };
  }
}

expect.extend({
  toBeWithinRange,
});