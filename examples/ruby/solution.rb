def square_fits?(heights, size)
  heights.size >= size && heights.take(size).min >= size
end

def max_square_size(heights)
  heights.each_index.find { |width| !square_fits?(heights, width + 1) } || heights.size
end

def square_sizes(landscape)
  landscape.each_index.map { |index|
    max_square_size(landscape.drop(index))
  }
end

landscape = File.read('input.txt').split("\n").map(&:to_i)
puts square_sizes(landscape).max
