import _ from 'lodash';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default () => {
  const [catList, setCatList] = useState([]);
  const [isCatListEmpty, setIsCatListEmpty] = useState(false);

  useEffect(() => {
    axios
      .get('/api/cats/')
      .then((response) => {
        const { data: catList } = response;
        if (_.isEmpty(catList)) setIsCatListEmpty(true);
        else setIsCatListEmpty(false);
        setCatList(catList);
      });
  }, []);

  const render = () => {
    if (isCatListEmpty) return <p>There is no data</p>;
    if (_.isEmpty(catList)) return <p>Loading...</p>;
    return catList.map(cat => (
      <div key={cat.catIdx}>
        <p>{cat.name}</p>
        <p>{cat.kind}</p>
        <p>{cat.age}</p>
        <p>{cat.furColor}</p>
      </div>
    ));
  };

  return (
    <div className="cat-list">
      {render()}
    </div>
  );
};
