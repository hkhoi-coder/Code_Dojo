def is_increasing(arr):
	for i in range(0, len(arr) - 1):
		if arr[i] > arr[i + 1]: return False
	return True

def selection_sort(arg):
	for i in range(len(arg)):
		min = arg[i]
		index = i

		for j in range(i,len(arg)):
			if arg[j] < min:
				min = arg[j]
				index = j

		temp = arg[i]
		arg[i] = arg[index]
		arg[index] = temp

def insertion_sort(arg):
	for i in range(1, len(arg)):
		cur = arg[i]
		j = i - 1
		while j >= 0 and arg[j] > cur:
			arg[j + 1] = arg[j]
			j -= 1
		arg[j + 1] = cur

def bubble_sort(arg):
	for i in range(len(arg) - 1, -1, -1):
		for j in range(i):
			if arg[j] > arg[j + 1]:
				temp = arg[j]
				arg[j] = arg[j + 1]
				arg[j + 1] = temp
def merge_sort(arg):
	if len(arg) <= 1: return

	mid = len(arg) / 2
	sub0 = arg[:mid]
	sub1 = arg[mid:]

	merge_sort(sub0)
	merge_sort(sub1)

	merge(arg, sub0, sub1)

def merge(master, sub0, sub1):
	i0 = 0
	i1 = 0
	for i in range(len(master)):
		if i0 >= len(sub0):
			master[i] = sub1[i1]
			i1 += 1
		elif i1 >= len(sub1):
			master[i] = sub0[i0]
			i0 += 1
		else:
			if sub0[i0] < sub1[i1]:
				master[i] = sub0[i0]
				i0 += 1
			else:
				master[i] = sub1[i1]
				i1 += 1

def quicksort(a):
	__partition(a, 0, len(a) - 1)

def __partition(a, left, right):
    print 'data =', a
    print '__partition(%d, %d)' % (left, right)
    if left >= right:
        print '%d >= %d, quitting...' % (left, right)
        print
	return

    i = left + 1
    j = right
    pivot = a[left]
    print 'pivot =', pivot
    isOK = False

    while not isOK:
        print 'Before moving, i = %d, j = %d' % (i, j)
    	while i < right and a[i] <= pivot:
    		i += 1
    	while j > left and a[j] > pivot:
    		j -= 1
    	print 'After moving, i = %d, j = %d' % (i, j)
        if i < j:
                print 'i < j, swap(i, j)'
    		a[i], a[j] = a[j], a[i]
    		i += 1
    		j -= 1
    	else:
                print 'i >= j, swap(pivot, j)'
    		a[j], a[left] = a[left], a[j]
    		isOK = True
    print
    __partition(a, left, j - 1)
    __partition(a, j + 1, right)

arr = [62,58,576,428,7568,74,6,857,5,8263,45,46,24,378,5824,368]
quicksort(arr)
print 'Final result =', arr
