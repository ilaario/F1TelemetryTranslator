# F1 Telemetry Client

This project is a Java-based client for receiving and processing telemetry data from the F1 video game series. It listens for UDP packets on a specified port, parses the incoming data, and handles it accordingly.

## Features

- Receives and parses various types of telemetry data packets, including motion data, session data, lap data, event data, participants data, car setups data, car telemetry data, car status data, final classification data, lobby info data, car damage data, and session history data.
- Supports forwarding of received data to other addresses.
- Handles both big and little endian data formats.

## Usage

To use this client, you need to instantiate the `F1TelemetryClient` class with the desired port, endian format, and a list of addresses to forward the data to (if any). Then, call the `start()` method to start listening for packets.

```java
F1TelemetryClient client = new F1TelemetryClient(20777, true, null);
client.start();
```

In the above example, the client is set to listen on port 20777 and expects data in little endian format. No forwarding addresses are specified.

## Dependencies

This project is written in Java and does not have any external dependencies.

## Contributing

Contributions are welcome. Please open an issue to discuss your ideas before making a pull request.

## License

This project is licensed under the terms of the MIT license.
