import _ from 'lodash';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default () => {
  const [dataList, setDataList] = useState([]);
  const [isDataListEmpty, setIsDataListEmpty] = useState(false);

  useEffect(() => {
    axios
      .get('/api/data')
      .then((response) => {
        const { data: dataList } = response;
        if (_.isEmpty(dataList)) setIsDataListEmpty(true);
        else setIsDataListEmpty(false);
        setDataList(dataList);
      });
  }, []);

  const render = () => {
    console.log(isDataListEmpty, _.isEmpty(dataList));
    if (isDataListEmpty) return <p>There is no data</p>;
    if (_.isEmpty(dataList)) return <p>Loading...</p>;
    return dataList.map(data => <p>{data}</p>);
  };

  return (
    <div className="data-list">
      {render()}
    </div>
  );
};
