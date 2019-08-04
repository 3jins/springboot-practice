const path = require('path');

const javaClassPath = path.resolve(__dirname, '..', 'resources');

module.exports = {
  mode: 'development',
  devtool: 'inline-source-map',
  entry: [path.resolve(__dirname, 'src', 'index.js')],
  output: {
    path: path.resolve(javaClassPath, 'static'),
    filename: 'bundle.js',
  },
  devServer: {
    port: 3000,
    contentBase: path.resolve(javaClassPath, 'static'),
  },
  module: {
    rules: [
      {
        test: /\.jsx?$/,
        exclude: /node_modules/,
        loader: 'babel-loader',
      },
      {
        test: /\.scss$|\.sass$/,
        use: [
          'style-loader',
          'css-loader',
          {
            loader: 'sass-loader',
            options: {
              includePaths: [path.resolve(__dirname, 'src')],
              data: '@import \'common\';',
            },
          },
        ],
      },
      {
        test: /\.png$|\.jpe?g$|\.gif$|\.ttf$|\.eot$|\.woff$|\.woff2$/,
        loader: 'url-loader',
      },
    ],
  },
  resolve: {
    modules: ['node_modules'],
    extensions: ['.js', '.json', '.jsx', '.css'],
  },
};
